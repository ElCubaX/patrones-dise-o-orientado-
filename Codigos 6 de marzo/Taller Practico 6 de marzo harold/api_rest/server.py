from fastapi import FastAPI

app = FastAPI()

@app.get("/saludo")
def read_root():
    return {"mensaje": "Señoras y Señores , la Api ya esta aqui, Que bonito y Que grosero."}
