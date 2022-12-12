package ie.atu.MovieProjectCICD;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table

public class Users {
    String name, email, password,genre;
    int age;
    @Id
    @GeneratedValue//
    private long count;

    public Users(String name, String email, String password, int age,String genre) {
        this.setName(name);
        this.setEmail(email);
        this.setPassword(password);
        this.setAge(age);
        this.setGenre(genre);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() > 3){
            this.name = name;}

        else{
            System.out.println("wrong");
            throw new IllegalArgumentException("Minimum of three characters required");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.contains("@")&& email.contains(".com")){
            this.email = email;}

        else{
            throw new IllegalArgumentException("Must include @ and .com");

        }


    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        if(validPassword(password)){
            this.password = password;}

        else{
            throw new IllegalArgumentException("Must include Uppercase, Lowercase, Number and Special Character");

        }


    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        if(age > 18)
        {
            this.age = age;
        }

        else{
            throw new IllegalArgumentException("Must be over 18 to access the site");
        }


    }
    public boolean validPassword(String pass) {
        boolean upper = false, lower = false,num = false, spec = false;
        char pointer;
        for(int i=0;i < pass.length();i++) {
            pointer = pass.charAt(i);

            if (Character.isUpperCase(pointer)) {
                upper = true;
            }

            else if (Character.isLowerCase(pointer)) {
                lower = true;
            }

            else if( Character.isDigit(pointer)) {
                num = true;
            }

            else{
                spec = true;
            }

            if(upper && lower && num && spec)
                return true;
        }
        return false;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
      if(Objects.equals(genre, "Horror") || Objects.equals(genre, "Action") || Objects.equals(genre, "Comedy")) {
         this.genre = genre;
       }

       else{
          throw new IllegalArgumentException("Must be Comedy, Horror, or Action");
      }
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", genre='" + genre + '\'' +
                ", age=" + age +
                ", count=" + count +
                '}';
    }
}
