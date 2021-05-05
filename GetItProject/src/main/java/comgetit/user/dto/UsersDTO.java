package comgetit.user.dto;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UsersDTO {
	
    private Long id;
	
    @NotBlank
    @NotNull
    @Size(min = 3, max = 50)
    private String firstname;
 	
    @NotNull
    @Size(min = 3, max = 50)
    private String lastname;
    
    @NotNull
    @Size(max = 50)
    private String phone;
    
    @NotNull
    private Date birthdate;
    
    @NotNull
    private String address;
    
    @NotNull
    private Long workAreaId;

    @NotNull
    @Size(max = 50)
    private String email;

    public UsersDTO(Long id, String firstname, String lastname, String phone, Date birthdate,
					String address, Long workAreaId, String email) {
        super();
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.birthdate = birthdate;
        this.address = address;
        this.workAreaId = workAreaId;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getWorkAreaId() {
        return workAreaId;
    }

    public void setWorkAreaId(Long workAreaId) {
        this.workAreaId = workAreaId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
