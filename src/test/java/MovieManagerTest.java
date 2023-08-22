import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    MovieManager manager= new MovieManager();

    @Test
    public void shouldTestShowMovies(){


    String[] expected= {};
    String[] actual= manager.findAll();

        Assertions.assertArrayEquals(expected,actual);

    }
    @Test
    public void shouldTestShowMoviesIfItsOne(){
        manager.addMoves("Movie I");
        String[] expected= {"Movie I"};
        String[] actual= manager.findAll();

        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void shouldTestShowMoviesIfItsMoreThenOne(){
        manager.addMoves("Movie I");
        manager.addMoves("Movie II");
        manager.addMoves("Movie III");

        String[] expected= {"Movie I", "Movie II", "Movie III"};
        String[] actual= manager.findAll();

        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void shouldTestMoviesIfItsAboutALimit(){
        manager.addMoves("Movie I");
        manager.addMoves("Movie II");
        manager.addMoves("Movie III");
        manager.addMoves("Movie IV");
        manager.addMoves("Movie V");

        String[] expected= {"Movie I", "Movie II", "Movie III","Movie IV", "Movie V"};
        String[] actual= manager.findAll();

        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void shouldTestMoviesIfItsAboveTheLimit(){
        manager.addMoves("Movie I");
        manager.addMoves("Movie II");
        manager.addMoves("Movie III");
        manager.addMoves("Movie IV");
        manager.addMoves("Movie V");
        manager.addMoves("Movie VI");

        String[] expected= {"Movie I", "Movie II", "Movie III","Movie IV", "Movie V"};
        String[] actual= manager.findAll();
    }
}
