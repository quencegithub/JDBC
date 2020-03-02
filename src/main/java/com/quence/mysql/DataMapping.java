package com.quence.mysql;
import java.io.Serializable;

public class DataMapping implements Serializable  {
	int iddirector;
	String FilmName;
	String Year;
	String Name;
	String Surname;

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
	public String getYear() {
		return Year;
	}
	public void setYear(String Year) {
		this.Year = Year;
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
	public void setSurname(String  surname) {
		this.Surname = surname;
	}
	@Override
public String toString(){
	return "DirectorName:" + getName() + "    Director Surname:"+ getSurname()+ "    FilmYear:" + getYear() + "    FilmName:" +getFilmName()  ; 
	
}
	
	
}
