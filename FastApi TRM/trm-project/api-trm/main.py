from fastapi import FastAPI
import requests

app = FastAPI()

def get_trm():
    """Consulta la TRM desde la API pública del Banco de la República."""
    url = "https://www.datos.gov.co/resource/ceyp-9c7c.json"
    response = requests.get(url)
    data = response.json()
    
    if data:
        return {"TRM": data[0]["valor"]}
    return {"error": "No se pudo obtener la TRM"}

@app.get("/trm")
def read_trm():
    return get_trm()
