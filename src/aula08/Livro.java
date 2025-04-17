package aula08;

public class Livro implements Publicacao{
	private String titulo, autor;
	private int totPaginas, pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	Livro(String titulo, String autor, int totPaginas, Pessoa leitor){
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.aberto = false;
		this.pagAtual = 0;
		this.leitor = leitor;
		
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getTotPaginas() {
		return this.totPaginas;
	}
	
	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}
	
	public int getPagAtual() {
		return this.pagAtual;
	}
	
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	
	public boolean getAberto() {
		return this.aberto;
	}
	
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	
	public Pessoa getLeitor() {
		return this.leitor;
	}
	
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
	public void detalhes() {
		System.out.println("\nDetalhes do livro\n");
		System.out.println("\nTítulo:\t" + this.getTitulo());
		System.out.println("\nAutor:\t" + this.getAutor());
		System.out.println("\nPágina Atual:\t" + this.getPagAtual());
		System.out.println("\nTotal de Páginas:\t" + this.getTotPaginas());
		System.out.println("\nEstá aberto?:\t" + this.getAberto());
		System.out.println("Leitor:\t" + leitor.getNome());
	}
	
	//Métodos Abstratos
	@Override
	public void abrir(){
		this.aberto = true;
		
	}
	@Override
	public void fechar(){
		this.aberto = false;
	}
	@Override
	public void folhear(int p){
		if(p>this.totPaginas) {
			this.pagAtual = 0;
		}
		else
			this.pagAtual = p;
	}
	@Override
	public void avancarPag(){
		this.pagAtual++;
	}
	@Override
	public void voltarPag(){
		this.pagAtual++;
	}
}
