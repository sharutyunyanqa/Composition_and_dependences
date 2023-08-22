import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    MovieManager manager = new MovieManager();

    @Test
    public void shouldTestShowMovies() {


        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldTestShowMoviesIfItsOne() {
        manager.addMoves("Movie I");
        String[] expected = {"Movie I"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestShowMoviesIfItsMoreThenOne() {
        manager.addMoves("Movie I");
        manager.addMoves("Movie II");
        manager.addMoves("Movie III");

        String[] expected = {"Movie I", "Movie II", "Movie III"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestMoviesIfItsAboutALimit() {
        manager.addMoves("Movie I");
        manager.addMoves("Movie II");
        manager.addMoves("Movie III");
        manager.addMoves("Movie IV");
        manager.addMoves("Movie V");

        String[] expected = {"Movie I", "Movie II", "Movie III", "Movie IV", "Movie V"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestFindLastForAboveTheLimit() {
        manager.addMoves("Movie I");
        manager.addMoves("Movie II");
        manager.addMoves("Movie III");
        manager.addMoves("Movie IV");
        manager.addMoves("Movie V");
        manager.addMoves("Movie VI");
        manager.addMoves("Movie VII");
        manager.addMoves("Movie VIII");
        manager.addMoves("Movie IX");
        manager.addMoves("Movie X");

        String[] expected = {"Movie X", "Movie IX", "Movie VIII", "Movie VII", "Movie VI"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestFindLastForZero() {
        String[] expected = {};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldTestFindLastForOne() {
        manager.addMoves("Movie I");


        String[] expected = {"Movie I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestFindLastForMoreThanOne() {
        manager.addMoves("Movie I");
        manager.addMoves("Movie II");
        manager.addMoves("Movie III");

        String[] expected = {"Movie III", "Movie II", "Movie I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTeFindLastForALimit() {
        manager.addMoves("Movie I");
        manager.addMoves("Movie II");
        manager.addMoves("Movie III");
        manager.addMoves("Movie IV");
        manager.addMoves("Movie V");

        String[] expected = {"Movie V", "Movie IV", "Movie III", "Movie II", "Movie I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
