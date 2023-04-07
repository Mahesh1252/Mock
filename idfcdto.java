package mock;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Component
@Entity
public class idfcdto {
@Id
private String Email;
private String Pwd;
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getPwd() {
	return Pwd;
}
public void setPwd(String pwd) {
	Pwd = pwd;
}


}
