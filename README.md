# Assignment 3: Bridge Pattern — Shape Rendering System

* **Student:** Sarsenbekov Sanzhar
* **Group:** SE-2524
* **Topic:** Drawing
* **Repository URL:** https://github.com/PageHun/assignment-sdp-3
* **Base Commit Hash:** `403c4d60`

---

## 1. Role Map & Source Paths

| Pattern Role                   | Class / Interface | Source Path |
|:-------------------------------| :--- | :--- |
| **Abstraction**                | `Shape` | `src/com/shape/Shape.java` |
| **Refined Abstraction 1 (A1)** | `Circle` | `src/com/shape/Circle.java` |
| **Refined Abstraction 2 (A2)** | `Square` | `src/com/shape/Square.java` |
| **Implementor**                | `Renderer` | `src/com/renderer/Renderer.java` |
| **Initial Implementor 1 (I1)** | `VectorRenderer` | `src/com/renderer/VectorRenderer.java` |
| **Initial Implementor 2 (I2)** | `RasterRenderer` | `src/com/renderer/RasterRenderer.java` |
| **Extension Implementor (I3)** | `AsciiRenderer` | `src/com/renderer/AsciiRenderer.java` |
| **Client code**                | `Main` | `src/Main.java` |

### Key Structural Points
* **Bridge Field:** `protected Renderer renderer;` in `src/com/shape/Shape.java`
* **Execute Operation:** `public abstract String execute();` in `src/com/shape/Shape.java`
* **Runtime Switcher:** `public void setImplementation(Renderer renderer)` in `src/com/shape/Shape.java`
* **T5 Identity & State Check:** Located in `src/Main.java` (verifies `beforeObject == afterObject`, ID, domain data, and results before and after switch).

---

## 2. Standard Build & Run Commands

To compile and run the project from the terminal using JDK 17+:

```bash
javac --release 17 -encoding UTF-8 -d out "@sources.txt"
java -cp out Main > demo-output.txt
```

## 3. Expected Demonstration Outcomes (T1–T7)

```text
======================= Required demonstration checks =======================
T1 | PASS | Circle + VectorRenderer | result=VECTOR circle id=1 radius=2.0
T2 | PASS | Circle + RasterRenderer | result=RASTER circle id=2 radius=2.0
T3 | PASS | Square + VectorRenderer | result=VECTOR square id=3 side=3.0
T4 | PASS | Square + RasterRenderer | result=RASTER square id=4 side=3.0
T5 | PASS | sameObject=true | stateUnchanged=true | before=<VECTOR circle id="5" radius="2.0"> | after=<RASTER circle id="5" radius="2.0">
T6 | PASS | Circle + AsciiRenderer | result=ASCII circle id=6 radius=2.0
T7 | PASS | Square + AsciiRenderer | result=ASCII square id=7 side=3.0
=============================================================================
SUMMARY: 7/7 PASS

