# 🗂️ service-registry-v1

Service ini adalah **Eureka Server** sebagai pusat service discovery dalam arsitektur microservices.  
Semua service seperti `web-v1`, `gateway`, atau `auth` akan register ke sini agar bisa saling mengenali secara otomatis.

---

## 🚀 Fitur

- Menyediakan Eureka Dashboard di port `8761`
- Menyimpan informasi seluruh service yang terdaftar
- Tidak ikut menjadi client atau meregister dirinya sendiri

---

## ⚙️ Konfigurasi `application.yml`

```yaml
server:
  port: 8761

spring:
  application:
    name: service-registry-v1

eureka:
  client:
    register-with-eureka: false
    fetch-registry: false
```

---

## 🧩 Dependency

- Spring Boot 3.5.3
- Spring Cloud 2025.0.0
- Spring Cloud Netflix Eureka Server

---

## ▶️ Cara Menjalankan

```bash
mvn clean install
mvn spring-boot:run
```

Lalu buka:
```
http://localhost:8761
```

---

## 🔗 Contoh Integrasi (di service lain)

```yaml
spring:
  application:
    name: user-company-web-v1

eureka:
  client:
    service-url:
      defaultZone: http://localhost:8761/eureka
```

---

## 🧱 Struktur

```
src/main/java/com/company/registry/
└── ServiceRegistryV1Application.java  ← dengan anotasi @EnableEurekaServer
```

---

## 📌 Catatan

- Hanya satu Eureka Server dibutuhkan untuk dev lokal
- Di production: minimal 2 instance (HA)

---

## 👨‍💻 Maintainer

[@dwiaribowokj](https://github.com/dwiaribowokj)