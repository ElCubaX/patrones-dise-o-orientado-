import pika

connection = pika.BlockingConnection(pika.ConnectionParameters(host='localhost'))
channel = connection.channel()

channel.queue_declare(queue='mensajes')

def callback(ch, method, properties, body):
    print(f" [x] Recibido {body.decode()}")

channel.basic_consume(queue='mensajes', on_message_callback=callback, auto_ack=True)

print(' [*] Esperando mensajes. Para salir presiona CTRL+C')
channel.start_consuming()
