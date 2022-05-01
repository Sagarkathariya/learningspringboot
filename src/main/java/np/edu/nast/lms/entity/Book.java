package np.edu.nast.lms.entity;

public class Book {
	private Long id;
	private String isbn;
	private String code;
	private String name;
	private String pages;
	private Double price;
	private String author;
	private String publication;
	private String edition;
	private String ecopy;
	private String qr;
	private String remarks;
	public Book() {
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPages() {
		return pages;
	}
	public void setPages(String pages) {
		this.pages = pages;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public String getEcopy() {
		return ecopy;
	}
	public void setEcopy(String ecopy) {
		this.ecopy = ecopy;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getQr() {
		return qr;
	}
	public void setQr(String qr) {
		this.qr = qr;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", isbn=" + isbn + ", code=" + code + ", name=" + name + ", pages=" + pages
				+ ", price=" + price + ", author=" + author + ", publication=" + publication + ", edition=" + edition
				+ ", ecopy=" + ecopy + ", remarks=" + remarks + "]";
	}
}
