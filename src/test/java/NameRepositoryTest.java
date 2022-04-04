
import org.example.NameRepository;
import org.junit.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runners.MethodSorters;

import javax.xml.soap.Name;
import java.util.Arrays;

public class NameRepositoryTest {
@Before
public  void s(){
    setUp();
    }
    @BeforeAll
    public static void setUp() {
    NameRepository.clear();
        NameRepository.add("Mikael Svensson");
        NameRepository.add("Mikael Jonsson");
    }

    @Test
    public void _2_in_length_should_be_2() {
        Assert.assertEquals(2, NameRepository.getSize());
    }

   @Test
    public void _2_in_length_should_NOT_be_3() {

        Assert.assertNotEquals(3, NameRepository.getSize());
    }

    @Test
    public void _1_name_added_should_return_same_name() {

        NameRepository.clear();
        String newName = "Anna Bengtsson";
        NameRepository.add(newName);
        String actualName = NameRepository.findAll()[NameRepository.getSize()-1];
        Assert.assertTrue(newName.equals(actualName));

    }
    @Test
    public void _added_names_should_return_same_names(){

        String[] names = {"Anna Bessson", "Lina Jacobsson", "Anna Bengtsson", "Krille Andersson"};

        NameRepository.setNames(names);
        String[] actualNames = NameRepository.findAll();
        Assert.assertArrayEquals(names, actualNames);
    }
    @Test
    public void _should_not_be_able_to_insert_duplicate_names(){

        String name = "Mikael Svensson";
        System.out.println(Arrays.toString(NameRepository.findAll()));
        Assert.assertFalse(NameRepository.add(name));
    }
    @Test
    public void _updated_name_should_be_updated(){

        NameRepository.clear();
        String newName= "Mikael Eriksson";
        NameRepository.setNames( new String[] {"Mikael Svensson", "Anna Lesson"} );
        NameRepository.update("Mikael Svensson", newName);
        String[] names = NameRepository.findAll();
        Assert.assertEquals(newName, names[0]);

    }
}
