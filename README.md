# 💱 Currency Converter (Java)

A Java console application that allows currency conversion between several currencies using real-time exchange rates. The project follows clean architecture principles with a modular and extensible design.

---

## 🚀 Features

- Convert between:
    - USD ↔ MXN
    - EUR ↔ MXN
    - CAD ↔ MXN
- Interactive console menu
- User input validation
- Real-time currency exchange rate retrieval via API
- Modular architecture: separation of model, business logic, and UI
- Clean and maintainable codebase

---

## 📁 Project Structure

```
dev.ghector6.currencyconverter/
├── app/
│   └── Main.java                # Entry point of the application
│
├── model/
│   ├── Currency.java            # Currency rate data model
│   └── ConversionOption.java    # Enum for conversion options
│
├── service/
│   ├── CurrencyConversion.java  # Business logic for conversions
│   └── CurrencyQuery.java       # Retrieves exchange rates from API
│
└── ui/
    └── ConsoleUI.java           # Console-based user interface
```

---

## 🛠️ Requirements

- Java 17 or later
- An IDE (IntelliJ IDEA, Eclipse, VS Code, etc.)
- (Optional) Gradle or Maven for build automation

---

## ▶️ How to Run

1. Clone the repository:

```bash
git clone https://github.com/yourusername/currency-converter-java.git
cd currency-converter-java
```

2. Open the project in your preferred IDE and compile it.

3. Run the `Main.java` class located in `dev.ghector6.currencyconverter.app`.

---

## 🔄 Example Usage

```
*******************************
Welcome to Currency Converter
1) USD => MXN
2) MXN => USD
3) EUR => MXN
4) MXN => EUR
5) CAD => MXN
6) MXN => CAD
7) Exit
*******************************
Select an option: 1
Enter amount to convert: 100
Result: 1700.00 MXN
```

---

## 🌐 API Management

This application retrieves **live currency exchange rates** from [ExchangeRate API](https://www.exchangerate-api.com/) using Java's `HttpClient`.

- **Endpoint used**:
  ```
  https://v6.exchangerate-api.com/v6/YOUR_API_KEY/latest/USD
  ```

- **How it works**:
    - A GET request is made using `HttpClient`.
    - The JSON response is parsed into a `Currency` object using the [Gson](https://github.com/google/gson) library with the `LOWER_CASE_WITH_UNDERSCORES` naming policy.
    - This ensures accurate mapping between the API's JSON and your Java model.

- **Error Handling**:
    - If the API call fails (due to connection issues or an invalid key), the app throws a `RuntimeException`. In the future, this could be improved with user-friendly error messages or fallback data.

- **Important**:
    - Replace the demo API key with your own. You can get one for free by signing up at [exchangerate-api.com](https://www.exchangerate-api.com/).

```java
URI uri = URI.create("https://v6.exchangerate-api.com/v6/YOUR_API_KEY/latest/USD");
```

---

## 🧱 Design Principles

- Single Responsibility Principle (SRP)
- Safe and clean user input handling
- Object-Oriented Programming (OOP)
- Enum-based conversion modeling
- Real-world API integration

---

## 📌 Future Improvements

- Robust API error handling and retries
- Fallback to cached or default rates on failure
- Support for more currencies and base rates
- GUI version using JavaFX or Swing
- Automated tests

---

## 🧑‍💻 Author

- **Ghector6**  
  [GitHub](https://github.com/ghector6)

---

## 📄 License

