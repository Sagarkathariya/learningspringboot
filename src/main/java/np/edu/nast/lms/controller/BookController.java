package np.edu.nast.lms.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import np.edu.nast.lms.entity.Book;

@RestController
@RequestMapping("/book")
public class BookController {

	private List<Book> bookList = new ArrayList<>();
	
	@GetMapping("/list")
	public List<Book> getAllBooks(){
		return bookList;
	}
	
	@PostMapping("/create")
	public Book createBook(@RequestBody Book book) {
		book.setId((bookList.size()+1L));
		bookList.add(book);
		return book;
	}
	
	@PutMapping("/update/{id}")
	public Book updateBook(@RequestBody Book book, @PathVariable("id") Long id) {
		if(book.getId()==id) {
			for(Book b:bookList) {
				if(b.getId()==id) {
					b.setAuthor(book.getAuthor());
					b.setEcopy(book.getEcopy());
					b.setPublication(book.getPublication());
					return b;
				}
			}
		}
		return null;
		
	}
	@DeleteMapping("/delete/{id}")
	public void deleteBook(@PathVariable("id") Long id) {
		for(Book b:bookList) {
			if(b.getId()==id) {
				bookList.remove(b);
			}
		}
	}
	
	@GetMapping("/get/{id}")
	public Book getBook(@PathVariable("id") Long id) {
		for(Book b:bookList) {
			if(b.getId()==id) {
				return b;
			}
		}
		return null;
	}
}
