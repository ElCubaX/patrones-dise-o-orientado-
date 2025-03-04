import pika

connection = pika.BlockingConnection(pika.ConnectionParameters(host='localhost'))
channel = connection.channel()

channel.queue_declare(queue='mensajes')

for i in range(10):
    mensaje = f"Mensaje {i+1}"
    channel.basic_publish(exchange='', routing_key='mensajes', body=mensaje)
    print(f" [x] Enviado: {mensaje}")


connection.close()
