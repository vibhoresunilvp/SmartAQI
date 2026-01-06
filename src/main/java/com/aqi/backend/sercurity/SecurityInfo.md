**Q: How do you implement authentication in your Spring Boot project?**

* We use JWT-based stateless authentication.
* On successful login, the server issues a signed JWT to the client.
* For subsequent requests, the client sends this token in the Authorization: Bearer <token> header, and Spring Security validates it via a custom filter.

**Q: How is the JWT generated?**
* We have a [JwtUtil](/Users/vibhore.sunil/Desktop/AQI-Monitor/backend/src/main/java/com/aqi/backend/sercurity/JwtUtil.java) component.
  It uses `io.jsonwebtoken.Jwts` and a secret key injected from [application.yaml](/Users/vibhore.sunil/Desktop/AQI-Monitor/backend/src/main/resources/application.yaml) (`jwt.secret`).
* `generateToken(String email)`:
  * Sets the `subject` claim to the user’s email.
  *  Adds `issuedAt` and `expiration` (currently 1 hour).
  *  Signs the token using an HMAC key: `Keys.hmacShaKeyFor(secret.getBytes())`
  *  The result is a compact JWT string that the client stores (e.g. in local storage) and sends with each request.