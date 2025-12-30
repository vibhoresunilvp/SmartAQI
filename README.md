# BreatheWise Backend – AI‑Powered AQI & Health Advisor

Spring Boot backend for an interactive AQI dashboard that:
- Tracks real‑time air quality for a user’s location
- Uses AI/ML to predict short‑term AQI trends
- Generates personalized health advice based on air quality and user profile

> This repository contains the **backend** services (APIs, security, persistence) for the BreatheWise AQI dashboard.

---

## Features

- **Real‑time AQI monitoring**
    - Fetches air quality data for a given city/coordinates
    - Designed to integrate with external AQI/open‑weather APIs

- **AI‑based AQI prediction** *(planned / WIP)*
    - Predicts near‑future AQI based on historical and current readings
    - Exposes prediction data via REST endpoints for the frontend

- **Personalized health advice**
    - Maps AQI levels to risk categories
    - Returns human‑readable recommendations (e.g. mask usage, outdoor activity, sensitive groups)

- **Secure API**
    - JWT‑based authentication and authorization
    - Spring Security integration for protecting endpoints

- **Fast data access**
    - PostgreSQL for persistent storage
    - Redis (reactive) for caching hot AQI data and sessions/tokens

---

## Tech Stack

- **Language:** Java 17
- **Framework:** Spring Boot 4 (WebMVC, Security, Validation)
- **Data:**
    - Spring Data JPA
    - PostgreSQL
    - Spring Data Redis Reactive
- **Auth:** JSON Web Tokens (JJWT)
- **Build Tool:** Maven
- **Other:** Lombok

---

## Getting Started

### Prerequisites

- JDK **17+**
- Maven **3.8+**
- Running instances of:
    - **PostgreSQL**
    - **Redis**

### Clone the repository

```bash
git clone [https://github.com/<your-username>/breathewise-backend.git](https://github.com/<your-username>/breathewise-backend.git)
cd breathewise-backend