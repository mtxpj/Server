package com.email.server.save.entities;

// Generated 2015-06-23 11:29:22 by Hibernate Tools 4.3.1

import static javax.persistence.GenerationType.IDENTITY;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PostPersist;
import javax.persistence.PostUpdate;
import javax.persistence.Table;

/**
 * Email generated by hbm2java
 */
@Entity
@Table(name = "email", catalog = "email_sender")
public class Email implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8866516766947175196L;
	private Long id;
	private String subject;
	private String message;
	private String responseName;
	private String responseEmail;
	private String failureNotificationUrlFk;
	private Date sendingDate;
	private List<AttachmentDownloadUrls> attachmentDownloadUrlses = new ArrayList<AttachmentDownloadUrls>(
			0);
	private List<AddresseeList> addresseeLists = new ArrayList<AddresseeList>(0);

	@PostPersist
	@PostUpdate
	public void postSave() {
		for (AddresseeList addresseeList : addresseeLists) {
			addresseeList.setEmail(this);
		}
		for (AttachmentDownloadUrls url : attachmentDownloadUrlses) {
			url.setEmail(this);
		}
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "subject", nullable = false, length = 100)
	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Column(name = "message", nullable = false, length = 1000)
	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Column(name = "response_name", nullable = false, length = 100)
	public String getResponseName() {
		return this.responseName;
	}

	public void setResponseName(String responseName) {
		this.responseName = responseName;
	}

	@Column(name = "response_email", nullable = false, length = 100)
	public String getResponseEmail() {
		return this.responseEmail;
	}

	public void setResponseEmail(String responseEmail) {
		this.responseEmail = responseEmail;
	}

	@Column(name = "failure_notification_url_fk", nullable = false, length = 256)
	public String getFailureNotificationUrlFk() {
		return this.failureNotificationUrlFk;
	}

	public void setFailureNotificationUrlFk(String failureNotificationUrlFk) {
		this.failureNotificationUrlFk = failureNotificationUrlFk;
	}

//	 @Temporal(TemporalType.DATE)
	@Column(name = "sending_date", length = 10)
	public Date getSendingDate() {
		return this.sendingDate;
	}

	public void setSendingDate(Date sendingDate) {
		this.sendingDate = sendingDate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "email", cascade = CascadeType.ALL)
	public List<AttachmentDownloadUrls> getAttachmentDownloadUrlses() {
		return this.attachmentDownloadUrlses;
	}

	public void setAttachmentDownloadUrlses(
			List<AttachmentDownloadUrls> attachmentDownloadUrlses) {
		this.attachmentDownloadUrlses = attachmentDownloadUrlses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "email", cascade = CascadeType.ALL)
	public List<AddresseeList> getAddresseeLists() {
		return this.addresseeLists;
	}

	public void setAddresseeLists(List<AddresseeList> addresseeLists) {
		this.addresseeLists = addresseeLists;
	}

}
