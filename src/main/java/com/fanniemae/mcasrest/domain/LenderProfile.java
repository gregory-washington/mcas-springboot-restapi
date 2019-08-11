package com.fanniemae.mcasrest.domain;

import javax.persistence.*;
import java.util.Date;


@Entity
public class LenderProfile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String unid;
	private String team_codes;
	private String lender_name;
	private String lender_number;
	private String lp_name;
	private String lp_lastname;
	private String lp_prefix;
	private String lp_title;
	private String lp_address;
	private String lp_address2;
	private String lp_city;
	private String lp_state;
	private String lp_zip;
	private String lp_phone;
	private String lp_fax;
	private String[] email;
	private String [] docAuthors;
	private String[] lp_cam;
	private String	lp_region;
	private String lp_status_seller;
	private String[]lp_affiliates;
	private String author;
	@Temporal(TemporalType.DATE)
	private Date creation_date;
	private String editor;
	@Temporal(TemporalType.DATE)
	private Date moddate;

	public LenderProfile() {
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUnid() {
		return unid;
	}

	public void setUnid(String unid) {
		this.unid = unid;
	}

	public String getTeam_codes() {
		return team_codes;
	}

	public void setTeam_codes(String team_codes) {
		this.team_codes = team_codes;
	}

	public String getLender_name() {
		return lender_name;
	}

	public void setLender_name(String lender_name) {
		this.lender_name = lender_name;
	}

	public String getLender_number() {
		return lender_number;
	}

	public void setLender_number(String lender_number) {
		this.lender_number = lender_number;
	}

	public String getLp_name() {
		return lp_name;
	}

	public void setLp_name(String lp_name) {
		this.lp_name = lp_name;
	}

	public String getLp_lastname() {
		return lp_lastname;
	}

	public void setLp_lastname(String lp_lastname) {
		this.lp_lastname = lp_lastname;
	}

	public String getLp_prefix() {
		return lp_prefix;
	}

	public void setLp_prefix(String lp_prefix) {
		this.lp_prefix = lp_prefix;
	}

	public String getLp_title() {
		return lp_title;
	}

	public void setLp_title(String lp_title) {
		this.lp_title = lp_title;
	}

	public String getLp_address() {
		return lp_address;
	}

	public void setLp_address(String lp_address) {
		this.lp_address = lp_address;
	}

	public String getLp_address2() {
		return lp_address2;
	}

	public void setLp_address2(String lp_address2) {
		this.lp_address2 = lp_address2;
	}

	public String getLp_city() {
		return lp_city;
	}

	public void setLp_city(String lp_city) {
		this.lp_city = lp_city;
	}

	public String getLp_state() {
		return lp_state;
	}

	public void setLp_state(String lp_state) {
		this.lp_state = lp_state;
	}

	public String getLp_zip() {
		return lp_zip;
	}

	public void setLp_zip(String lp_zip) {
		this.lp_zip = lp_zip;
	}

	public String getLp_phone() {
		return lp_phone;
	}

	public void setLp_phone(String lp_phone) {
		this.lp_phone = lp_phone;
	}

	public String getLp_fax() {
		return lp_fax;
	}

	public void setLp_fax(String lp_fax) {
		this.lp_fax = lp_fax;
	}

	public String[] getEmail() {
		return email;
	}

	public void setEmail(String[] email) {
		this.email = email;
	}

	public String[] getDocAuthors() {
		return docAuthors;
	}

	public void setDocAuthors(String[] docAuthors) {
		this.docAuthors = docAuthors;
	}

	public String[] getLp_cam() {
		return lp_cam;
	}

	public void setLp_cam(String[] lp_cam) {
		this.lp_cam = lp_cam;
	}

	public String getLp_region() {
		return lp_region;
	}

	public void setLp_region(String lp_region) {
		this.lp_region = lp_region;
	}

	public String getLp_status_seller() {
		return lp_status_seller;
	}

	public void setLp_status_seller(String lp_status_seller) {
		this.lp_status_seller = lp_status_seller;
	}

	public String[] getLp_affiliates() {
		return lp_affiliates;
	}

	public void setLp_affiliates(String[] lp_affiliates) {
		this.lp_affiliates = lp_affiliates;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(Date creation_date) {
		this.creation_date = creation_date;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public Date getModdate() {
		return moddate;
	}

	public void setModdate(Date moddate) {
		this.moddate = moddate;
	}

}
