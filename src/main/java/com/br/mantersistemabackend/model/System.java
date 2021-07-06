package com.br.mantersistemabackend.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tbl_system")
public class System implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_system")
    private Long id;

    @Column(name = "ds_description")
    @NotNull
    private String description;

    @Column(name = "ds_initials")
    @NotNull
    private String initials;

    @Column(name = "ds_email")
    private String email;

    @Column(name = "ds_url")
    private String url;

    public System() {
    }

    public System(Long id, String description, String initials, String email, String url) {
        this.id = id;
        this.description = description;
        this.initials = initials;
        this.email = email;
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof System)) return false;
        System system = (System) o;
        return Objects.equals(getId(), system.getId()) && Objects.equals(getDescription(), system.getDescription()) && Objects.equals(getInitials(), system.getInitials()) && Objects.equals(getEmail(), system.getEmail()) && Objects.equals(getUrl(), system.getUrl());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDescription(), getInitials(), getEmail(), getUrl());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
