<h1 align="center">✈️ JLFlowTravel</h1>

<h3 align="center">Sistema inteligente de gestión para agencias de viajes</h3>

---

## 📝 Descripción del Proyecto

**JLFlowTravel** es un sistema modular, limpio y funcional, creado para facilitar la gestión comercial de agencias de viajes. Su enfoque combina arquitectura de datos bien diseñada con automatización de procesos críticos como clientes, billetes y facturación.

Diseñado con una base técnica sólida, este proyecto prioriza el **backend limpio y escalable**, preparando el terreno para una interfaz amigable en futuras fases.


##  Proceso de Desarrollo – Etapa 1: Arquitectura & Carga de Datos

<details>
<summary>📌 <strong>Diseño de base de datos</strong></summary>

Se construyó un modelo relacional en <strong>Tercera Forma Normal (3NF)</strong>, enfocado en escalabilidad y mantenibilidad. Las entidades clave incluyen:

- <code>Aeropuertos</code>, <code>Municipalidades</code>, <code>Regiones</code>, <code>Países</code>, <code>TipoAeropuertos</code>
- Relaciones con claves primarias y foráneas
- Optimización anticipada para consultas y futuras integraciones

</details>

<details>
<summary>🛠️ <strong>Procesos ETL en Python</strong></summary>

Scripts diseñados a medida realizan:

- Limpieza de datos incompletos o inválidos  
- Normalización de campos (tipos, nombres, códigos)  
- Separación de datos jerárquicos  
- Exportación estructurada a CSV  
</details>

<details>
<summary>🗃️ <strong>Carga a PostgreSQL</strong></summary>

Los datos tratados se integran en una base <strong>PostgreSQL</strong> estructurada, con:

- Constraints de integridad  
- Índices según criterios de búsqueda  
- Datos limpios y consistentes listos para operar  
<img width="2317" height="1533" alt="agencia pgerd" src="https://github.com/user-attachments/assets/6dc2144d-1016-443a-879f-fea280525636" />

</details>


## Fuente de los datos

📥 [ourairports.com/data](https://ourairports.com/data/)  
Conjuntos tratados: Aeropuertos, Países, Regiones...

---

## 🚀 Tecnologías utilizadas

- **PostgreSQL** – Base de datos relacional central.
- **Python** – Procesos ETL personalizados.
- **Spring Boot (Java)** – Backend con API REST.
- *(Futuro)* **React** – Interfaz de usuario.

---


## ✨ Próximos pasos

- Implementación de endpoints RESTful (Spring Boot)
- Pruebas unitarias de servicios
- Frontend con React (fase futura)
- Autenticación y roles (admin/cliente)
