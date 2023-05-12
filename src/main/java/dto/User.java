package dto;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;
@Entity
@Data
public class User 
{
	@Id
	@GeneratedValue(generator = "x")
	@SequenceGenerator(name="x",sequenceName = "x",initialValue =121456,allocationSize = 1)
	int id;
	String name;
	String lname;
	long mobile;
	String email;
	String gender;
	String pass;
	Date dob;
}
