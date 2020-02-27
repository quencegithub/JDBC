import java.io.Serializable;

public class Database implements Serializable  {

	int idfilm;
	public int getIdfilm() {
		return idfilm;
	}
	public void setIdfilm(int idfilm) {
		this.idfilm = idfilm;
	}
	public int getIddirector() {
		return iddirector;
	}
	public void setIddirector(int iddirector) {
		this.iddirector = iddirector;
	}
	public String getFilmName() {
		return FilmName;
	}
	public void setFilmName(String filmName) {
		FilmName = filmName;
	}
	public String getFilmYear() {
		return FilmYear;
	}
	public void setFilmYear(String filmYear) {
		FilmYear = filmYear;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	int iddirector;
	String FilmName;
	String FilmYear;
	String Name;
	String Surname;
	
}
