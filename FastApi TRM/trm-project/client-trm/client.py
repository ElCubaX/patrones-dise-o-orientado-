import os
import time
import requests

INTERVAL = int(os.getenv("INTERVAL", 10))
API_URL = os.getenv("API_URL", "http://trm-api:8000/trm")  

def fetch_trm():
    try:
        response = requests.get(API_URL)
        if response.status_code == 200:
            print(f"TRM Response: {response.json()}")
        else:
            print(f"Error: {response.status_code}, {response.text}")
    except Exception as e:
        print(f"Request failed: {e}")

if __name__ == "__main__":
    while True:
        fetch_trm()
        time.sleep(INTERVAL)
