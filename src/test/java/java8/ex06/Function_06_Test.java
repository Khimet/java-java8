package java8.ex06;


import java.util.function.Supplier;

import org.junit.Test;

import java8.data.Person;

/**
 * Exercice 06 - java.util.function.Supplier
 */
public class Function_06_Test {


    // tag::formatAge[]
    // TODO compléter la méthode
    // TODO la méthode retourne une chaîne de caractères de la forme [age=<AGE>] (exemple : [age=12])
    String formatAge(Supplier<Person> supplier) {
    	
    	Person person = supplier.get();
    	
        return "[age=" + person.getAge() + "]";
    }
    // end::formatAge[]


    @Test
    public void test_supplier_formatAge() throws Exception {
        // TODO compléter le test unitaire pour qu'il soit passant
    	
    	Supplier<Person> supplierPerson = () -> new Person("Jean", "France", 35, "pass");
    	
        String result = formatAge(supplierPerson);

        assert result.equals("[age=35]");
    }

}
