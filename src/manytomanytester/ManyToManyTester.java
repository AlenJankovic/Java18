/*
 * 
 * 
 * 
 */

package manytomanytester;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import pac.Author;
import pac.Book;


public class ManyToManyTester {

   
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ManyToManyTesterPU");
        EntityManager em = emf.createEntityManager();
             
             
        try{
            em.getTransaction().begin();
            Book book1 = new Book();
            book1.setTitle("Soleiga dagar");
            book1.setPages(350);
            Book book2 = new Book();
            book2.setTitle("Vintertid");
            book2.setPages(200);
            
            Author author1= new Author();
            author1.setName("Cris Cris");
            author1.setCountry("England");
            Author author2 = new Author();
            author2.setName("Bane Lane");
            author2.setCountry("USA");
            
            Set<Book> books = new HashSet();
            books.add(book1);
            books.add(book2);
            
            Set<Author> authors= new HashSet();
            authors.add(author1);
            authors.add(author2);
            book1.setAuthors(authors);
            author1.setBooks(books);
            book2.setAuthors(authors);
            author2.setBooks(books);
            em.persist(book1);
            em.persist(author1);
            em.persist(book2);
            em.persist(author2);
            
            
            em.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace();
            em.getTransaction().rollback();
        }
      
    }

}
