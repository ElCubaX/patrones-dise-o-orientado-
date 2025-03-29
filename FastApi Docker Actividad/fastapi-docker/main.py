from fastapi import FastAPI

app = FastAPI()

@app.get("/")
def read_root():
    return {"message": "Hola Docker + FastAPI"}

@app.get("/saludo/{nombre}")
def saludo(nombre: str):
    return {"message": f"Hola, {nombre}!"}
