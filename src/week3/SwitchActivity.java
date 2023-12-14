package week3;

import javax.swing.*;

public class SwitchActivity {
    public static void main(String[] args) {


        // I GOT ALL THESE PLANET STATS FROM ChatGPT SORRY IF THEY'RE WRONG

        String planet = JOptionPane.showInputDialog(null, "Enter a planet in the solar system: ");
        String planetInfo = switch (planet.toLowerCase()) {
            case "mercury" -> "You entered mercury: \nCircumference(km):15,329\n Average Distance from the Sun(km):57.9 Million\nNumber of Moons:0";
            case "venus" -> "You entered venus: \nCircumference(km):38,024\nAverage Distance from the Sun(km):108.2 Million\nNumber of Moons:0";
            case "earth" -> "You entered earth: \nCircumference(km):40,075\nAverage Distance from the Sun(km):149.6 Million\nNumber of Moons:1 (THE ONE AND ONLY EARTH #1!)";
            case "mars" -> "You entered mars: \nCircumference(km):21.344\nAverage Distance from the Sun(km):227.9 Million\nNumber of Moons:2";
            case "jupiter" -> "You entered jupiter: \nCircumference(km):439,264\nAverage Distance from the Sun(km):778.3 Million\nNumber of Moons:79";
            case "saturn" -> "You entered saturn: \nCircumference(km):365,882\nAverage Distance from the Sun(km):1.4 Billion\nNumber of Moons:83";
            case "uranus" -> "You entered uranus: \nCircumference(km):160,590\nAverage Distance from the Sun(km):2.9 Billion\nNumber of Moons:27";
            case "neptune" -> "You entered neptune: \nCircumference(km):155,600\nAverage Distance from the Sun(km):4.5 Billion\nNumber of Moons:14";
            case "pluto" -> "I'm sorry it's not a planet. I miss it too. Rest in Peace little guy <3\n Actually I'll do it anyway \nCircumference(km):4,494\nAverage Distance from the Sun(km):5.91 Billion\nNumber of Moons:5";

            default -> "The planet you entered is not valid. There is no info.";


        };
        JOptionPane.showMessageDialog(null, planetInfo);
    }
}
