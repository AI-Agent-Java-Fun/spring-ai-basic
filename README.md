# Spring AI + OpenRouter Integration Example

This project demonstrates how to easily integrate [OpenRouter](https://openrouter.ai) with [Spring AI](https://docs.spring.io/spring-ai/reference/) for simple chat-based interactions using a REST API.

## ✨ Features

- Minimal Spring Boot setup using `spring-ai-openai-spring-boot-starter`
- Preconfigured for use with OpenRouter-compatible models (e.g. `deepseek-chat-v3`)
- Just plug in your API key and start interacting
- REST endpoint ready for testing or integration

## 🔧 Requirements

- Java 17+
- Maven (but you can easily use Gradle instead)
- An [OpenRouter](https://openrouter.ai) API key

## 🚀 Getting Started

**Insert your OpenRouter API key:**

Open src/main/resources/application.yml and replace {Api-Key} with your actual API key:


   ```yaml
      spring:
         ai:
            openai:
               api-key: your-api-key-here
               base-url: https://openrouter.ai/api
               chat:
                  options:
                     model: deepseek/deepseek-chat-v3-0324:free
   ```

## 🧩 Project Structure

- `Main.java` – Spring Boot application entry point  
- `Config.java` – Configures the Spring AI `ChatClient`  
- `Controller.java` – REST controller that handles prompt requests  
- `TextFromUser.java` – Simple DTO for user input  
- `application.yml` – Configuration file for connecting to OpenRouter 