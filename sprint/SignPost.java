package sprint;

public class SignPost {

    // Метод, который вычисляет площадь "прямоугольника", содержащего строку
    public int getArea(String text) {
        // Разбиваем строку на части по символу переноса строки
        String[] lines = text.split("\n");

        // Высота прямоугольника — это количество строк
        int height = lines.length;

        // Ищем самую длинную строку, чтобы узнать ширину
        int width = 0;
        for (String line : lines) {
            if (line.length() > width) {
                width = line.length(); // Запоминаем максимальную длину строки
            }
        }

        // Площадь прямоугольника = высота * ширина
        return height * width;
    }
}
