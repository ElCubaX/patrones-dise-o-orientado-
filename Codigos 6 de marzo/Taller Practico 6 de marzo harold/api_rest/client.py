import requests
import threading
import time

URL = "http://127.0.0.1:8000/saludo"

def consumir_api():
    for i in range(5):
        response = requests.get(URL)
        print(f"Intento {i+1}: {response.json()}")
        time.sleep(2)  # Espera 2 segundos antes de hacer otra petición

hilo = threading.Thread(target=consumir_api)

hilo.start()

hilo.join()
