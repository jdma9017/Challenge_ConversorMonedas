# 💱 Conversor de Monedas en Java

Este proyecto es un **Conversor de Monedas** desarrollado en **Java** que consume datos en tiempo real desde una API de tasas de cambio. Utiliza `HttpClient`, `HttpRequest`, `HttpResponse` y la librería `Gson` para procesar datos JSON, permitiendo convertir entre distintas monedas latinoamericanas y el dólar estadounidense.

---

## 🚀 Tecnologías utilizadas

- Java 11+
- IntelliJ IDEA (recomendado)
- Gson 2.10.1 (Google)
- ExchangeRate API (https://www.exchangerate-api.com/)

---

## 🔧 Estructura del proyecto

```
ConversorMonedas/
├── src/
│   └── conversor/
│       ├── APIClient.java      # Realiza solicitud HTTP y obtiene JSON
│       ├── Moneda.java         # Modelo de datos para tasas de cambio
│       └── Conversor.java      # Menú interactivo, lógica principal
├── lib/
│   └── gson-2.10.1.jar         # Librería externa para procesar JSON
```

---

## 🧠 Funcionamiento

1. Al iniciar, el programa muestra un menú interactivo en consola.
2. El usuario selecciona el tipo de conversión entre las siguientes monedas:
   - USD ⇄ ARS (Peso argentino)
   - USD ⇄ BRL (Real brasileño)
   - USD ⇄ COP (Peso colombiano)
3. El sistema consulta automáticamente la tasa de cambio desde la API.
4. Realiza el cálculo y muestra el valor convertido.

---

## 📦 Instalación y uso

### 1. Clonar el repositorio

```bash
git clone https://github.com/tuusuario/ConversorMonedas.git
cd ConversorMonedas
```

### 2. Abrir en IntelliJ

- Abre IntelliJ IDEA
- Selecciona `Open` y elige la carpeta del proyecto

### 3. Agregar la librería Gson

- Ve a `File > Project Structure > Modules > Dependencies`
- Haz clic en `+ > JARs or directories...`
- Selecciona `lib/gson-2.10.1.jar`
- Marca la opción `Compile` y guarda los cambios

### 4. Ejecutar el programa

Abre `Conversor.java`, haz clic derecho en `main` y selecciona `Run`.

---

## 🔐 Clave API

Este proyecto utiliza una clave gratuita de [ExchangeRate-API](https://www.exchangerate-api.com/):

```
311fefdae43e66ca44756142
```

Puedes reemplazarla por tu propia clave gratuita si deseas personalizarlo.

---

## 📌 Próximas mejoras

- Exportar historial de conversiones a archivo `.txt`
- Validación de entrada robusta (números negativos, letras, etc.)
- Interfaz gráfica (Swing o JavaFX)
- Más monedas soportadas (BOB, CLP, etc.)

---

## 🧑‍💻 Autor

**Juan David Mejía Atehortúa**  
Proyecto desarrollado como desafío práctico para integrar consumo de APIs, manipulación JSON y estructura modular en Java.

---

## 📄 Licencia

Este proyecto está bajo licencia MIT. Puedes usarlo, modificarlo y distribuirlo libremente.
