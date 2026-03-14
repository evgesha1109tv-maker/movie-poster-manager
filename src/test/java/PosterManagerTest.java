import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    @Test
    public void filmManagerTest0Film() {
        PosterManager manager = new PosterManager();
        //manager.addFilms("Бладшот.боевик");
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void filmManagerTestNew1Film() {
        PosterManager manager = new PosterManager();
        manager.addFilms("Бладшот.боевик");
        String[] expected = {"Бладшот.боевик"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void filmManagerTestNew3Film() {
        PosterManager manager = new PosterManager();
        manager.addFilms("Бладшот.боевик");
        manager.addFilms("Вперёд.Мультфильм");
        manager.addFilms("Отель «Белград».Комедия");
        String[] expected = {"Бладшот.боевик", "Вперёд.Мультфильм", "Отель «Белград».Комедия"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void filmManagerLastTest3FilmLimitAuto() {
        PosterManager manager = new PosterManager();
        manager.addFilms("Бладшот.боевик");
        manager.addFilms("Вперёд.Мультфильм");
        manager.addFilms("Отель «Белград».Комедия");
        String[] expected = {"Отель «Белград».Комедия", "Вперёд.Мультфильм", "Бладшот.боевик"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void filmManagerLastTest5FilmLimitAuto() {
        PosterManager manager = new PosterManager();
        manager.addFilms("Бладшот.боевик");
        manager.addFilms("Вперёд.Мультфильм");
        manager.addFilms("Отель «Белград».Комедия");
        manager.addFilms("Человек-невидимка.Ужасы");
        manager.addFilms("Тролли. Мировой тур.Мультфильм");
        //manager.addFilms();

        String[] expected = {"Тролли. Мировой тур.Мультфильм", "Человек-невидимка.Ужасы", "Отель «Белград».Комедия", "Вперёд.Мультфильм", "Бладшот.боевик"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void filmManagerLastTest5FilmLimit3() {
        PosterManager manager = new PosterManager(3);
        manager.addFilms("Бладшот.боевик");
        manager.addFilms("Вперёд.Мультфильм");
        manager.addFilms("Отель «Белград».Комедия");
        manager.addFilms("Человек-невидимка.Ужасы");
        manager.addFilms("Тролли. Мировой тур.Мультфильм");
        //manager.addFilms();

        String[] expected = {"Тролли. Мировой тур.Мультфильм", "Человек-невидимка.Ужасы", "Отель «Белград».Комедия"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void filmManagerLastTest5FilmLimit7() {
        PosterManager manager = new PosterManager(7);
        manager.addFilms("Бладшот.боевик");
        manager.addFilms("Вперёд.Мультфильм");
        manager.addFilms("Отель «Белград».Комедия");
        manager.addFilms("Человек-невидимка.Ужасы");
        manager.addFilms("Тролли. Мировой тур.Мультфильм");
        //manager.addFilms();

        String[] expected = {"Тролли. Мировой тур.Мультфильм", "Человек-невидимка.Ужасы", "Отель «Белград».Комедия", "Вперёд.Мультфильм", "Бладшот.боевик"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void filmManagerLastTest5FilmLimit4() {
        PosterManager manager = new PosterManager(4);
        manager.addFilms("Бладшот.боевик");
        manager.addFilms("Вперёд.Мультфильм");
        manager.addFilms("Отель «Белград».Комедия");
        manager.addFilms("Человек-невидимка.Ужасы");
        manager.addFilms("Тролли. Мировой тур.Мультфильм");
        //manager.addFilms();

        String[] expected = {"Тролли. Мировой тур.Мультфильм", "Человек-невидимка.Ужасы", "Отель «Белград».Комедия", "Вперёд.Мультфильм"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void filmManagerLastTest5FilmLimit6() {
        PosterManager manager = new PosterManager(6);
        manager.addFilms("Бладшот.боевик");
        manager.addFilms("Вперёд.Мультфильм");
        manager.addFilms("Отель «Белград».Комедия");
        manager.addFilms("Человек-невидимка.Ужасы");
        manager.addFilms("Тролли. Мировой тур.Мультфильм");
        //manager.addFilms();

        String[] expected = {"Тролли. Мировой тур.Мультфильм", "Человек-невидимка.Ужасы", "Отель «Белград».Комедия", "Вперёд.Мультфильм", "Бладшот.боевик"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void filmManagerLastTest5FilmLimit0() {
        PosterManager manager = new PosterManager(0);
        manager.addFilms("Бладшот.боевик");
        manager.addFilms("Вперёд.Мультфильм");
        manager.addFilms("Отель «Белград».Комедия");
        manager.addFilms("Человек-невидимка.Ужасы");
        manager.addFilms("Тролли. Мировой тур.Мультфильм");
        //manager.addFilms();

        String[] expected = {"Тролли. Мировой тур.Мультфильм", "Человек-невидимка.Ужасы", "Отель «Белград».Комедия", "Вперёд.Мультфильм", "Бладшот.боевик"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void filmManagerLastTest5FilmLimitLess0() {
        PosterManager manager = new PosterManager(-1);
        manager.addFilms("Бладшот.боевик");
        manager.addFilms("Вперёд.Мультфильм");
        manager.addFilms("Отель «Белград».Комедия");
        manager.addFilms("Человек-невидимка.Ужасы");
        manager.addFilms("Тролли. Мировой тур.Мультфильм");
        //manager.addFilms();

        String[] expected = {"Тролли. Мировой тур.Мультфильм", "Человек-невидимка.Ужасы", "Отель «Белград».Комедия", "Вперёд.Мультфильм", "Бладшот.боевик"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void filmManagerLastTest9FilmLimitAuto5() {
        PosterManager manager = new PosterManager();
        manager.addFilms("Бладшот.боевик");
        manager.addFilms("Вперёд.Мультфильм");
        manager.addFilms("Отель «Белград».Комедия");
        manager.addFilms("Человек-невидимка.Ужасы");
        manager.addFilms("Тролли. Мировой тур.Мультфильм");
        manager.addFilms("Джентельмены.Боевик");
        manager.addFilms("Союз спасения.Драма");
        manager.addFilms("Последний богатырь.Приключения");
        manager.addFilms("Холоп.Комедия");
        //manager.addFilms();

        String[] expected = {"Холоп.Комедия","Последний богатырь.Приключения" , "Союз спасения.Драма","Джентельмены.Боевик" , "Тролли. Мировой тур.Мультфильм"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void filmManagerLastTest9FilmLimit6() {
        PosterManager manager = new PosterManager(6);
        manager.addFilms("Бладшот.боевик");
        manager.addFilms("Вперёд.Мультфильм");
        manager.addFilms("Отель «Белград».Комедия");
        manager.addFilms("Человек-невидимка.Ужасы");
        manager.addFilms("Тролли. Мировой тур.Мультфильм");
        manager.addFilms("Джентельмены.Боевик");
        manager.addFilms("Союз спасения.Драма");
        manager.addFilms("Последний богатырь.Приключения");
        manager.addFilms("Холоп.Комедия");
        //manager.addFilms();

        String[] expected = {"Холоп.Комедия","Последний богатырь.Приключения" , "Союз спасения.Драма","Джентельмены.Боевик" , "Тролли. Мировой тур.Мультфильм","Человек-невидимка.Ужасы"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void filmManagerLastTest9FilmLimit9() {
        PosterManager manager = new PosterManager(9);
        manager.addFilms("Бладшот.боевик");
        manager.addFilms("Вперёд.Мультфильм");
        manager.addFilms("Отель «Белград».Комедия");
        manager.addFilms("Человек-невидимка.Ужасы");
        manager.addFilms("Тролли. Мировой тур.Мультфильм");
        manager.addFilms("Джентельмены.Боевик");
        manager.addFilms("Союз спасения.Драма");
        manager.addFilms("Последний богатырь.Приключения");
        manager.addFilms("Холоп.Комедия");
        //manager.addFilms();

        String[] expected = {"Холоп.Комедия","Последний богатырь.Приключения" , "Союз спасения.Драма","Джентельмены.Боевик" , "Тролли. Мировой тур.Мультфильм","Человек-невидимка.Ужасы","Отель «Белград».Комедия","Вперёд.Мультфильм","Бладшот.боевик"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
