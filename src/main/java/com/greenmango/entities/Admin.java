package com.greenmango.entities;
// Generated Mar 30, 2019 11:34:21 PM by Hibernate Tools 5.1.10.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Admin generated by hbm2java
 */
@Entity
@Table(name = "admin", catalog = "green_mango")
public class Admin implements java.io.Serializable {

	private AdminId id;

	public Admin() {
	}

	public Admin(AdminId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "username", column = @Column(name = "username", nullable = false, length = 50)),
			@AttributeOverride(name = "password", column = @Column(name = "password", nullable = false, length = 50)),
			@AttributeOverride(name = "phone", column = @Column(name = "phone", length = 12)),
			@AttributeOverride(name = "email", column = @Column(name = "email", length = 30)) })
	public AdminId getId() {
		return this.id;
	}

	public void setId(AdminId id) {
		this.id = id;
	}

}
