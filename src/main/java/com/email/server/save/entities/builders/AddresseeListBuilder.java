// CHECKSTYLE:OFF
/**
 * Source code generated by Fluent Builders Generator
 * Do not modify this file
 * See generator home page at: http://code.google.com/p/fluent-builders-generator-eclipse-plugin/
 */

package com.email.server.save.entities.builders;

import java.util.ArrayList;
import java.util.List;

import com.email.server.save.entities.AddresseeList;
import com.email.server.save.entities.AttachmentDownloadUrls;
import com.email.server.save.entities.Email;

public class AddresseeListBuilder extends
		AddresseeListBuilderBase<AddresseeListBuilder> {
	public static AddresseeListBuilder addresseeList() {
		return new AddresseeListBuilder();
	}

	public AddresseeListBuilder() {
		super(new AddresseeList());
	}

	public AddresseeList build() {
		return getInstance();
	}
}

class AddresseeListBuilderBase<GeneratorT extends AddresseeListBuilderBase<GeneratorT>> {
	private AddresseeList instance;

	protected AddresseeListBuilderBase(AddresseeList aInstance) {
		instance = aInstance;
	}

	protected AddresseeList getInstance() {
		return instance;
	}

	@SuppressWarnings("unchecked")
	public GeneratorT withId(Long aValue) {
		instance.setId(aValue);

		return (GeneratorT) this;
	}

	@SuppressWarnings("unchecked")
	public GeneratorT withEmail(Email aValue) {
		instance.setEmail(aValue);

		return (GeneratorT) this;
	}

	public EmailEmailBuilder withEmail() {
		Email obj = new Email();

		withEmail(obj);

		return new EmailEmailBuilder(obj);
	}

	@SuppressWarnings("unchecked")
	public GeneratorT withAddressee(String aValue) {
		instance.setAddressee(aValue);

		return (GeneratorT) this;
	}

	public class EmailEmailBuilder extends EmailBuilderBase<EmailEmailBuilder> {
		public EmailEmailBuilder(Email aInstance) {
			super(aInstance);
		}

		@SuppressWarnings("unchecked")
		public GeneratorT endEmail() {
			return (GeneratorT) AddresseeListBuilderBase.this;
		}
	}

	public static class EmailBuilderBase<GeneratorT extends EmailBuilderBase<GeneratorT>> {
		private Email instance;

		protected EmailBuilderBase(Email aInstance) {
			instance = aInstance;
		}

		protected Email getInstance() {
			return instance;
		}

		@SuppressWarnings("unchecked")
		public GeneratorT withId(Long aValue) {
			instance.setId(aValue);

			return (GeneratorT) this;
		}

		@SuppressWarnings("unchecked")
		public GeneratorT withSubject(String aValue) {
			instance.setSubject(aValue);

			return (GeneratorT) this;
		}

		@SuppressWarnings("unchecked")
		public GeneratorT withMessage(String aValue) {
			instance.setMessage(aValue);

			return (GeneratorT) this;
		}

		@SuppressWarnings("unchecked")
		public GeneratorT withResponseName(String aValue) {
			instance.setResponseName(aValue);

			return (GeneratorT) this;
		}

		@SuppressWarnings("unchecked")
		public GeneratorT withResponseEmail(String aValue) {
			instance.setResponseEmail(aValue);

			return (GeneratorT) this;
		}

		@SuppressWarnings("unchecked")
		public GeneratorT withFailureNotificationUrlFk(String aValue) {
			instance.setFailureNotificationUrlFk(aValue);

			return (GeneratorT) this;
		}

		@SuppressWarnings("unchecked")
		public GeneratorT withAttachmentDownloadUrlses(
				List<AttachmentDownloadUrls> aValue) {
			instance.setAttachmentDownloadUrlses(aValue);

			return (GeneratorT) this;
		}

		@SuppressWarnings("unchecked")
		public GeneratorT withAddedAttachmentDownloadUrls(
				AttachmentDownloadUrls aValue) {
			if (instance.getAttachmentDownloadUrlses() == null) {
				instance.setAttachmentDownloadUrlses(new ArrayList<AttachmentDownloadUrls>());
			}

			((ArrayList<AttachmentDownloadUrls>) instance
					.getAttachmentDownloadUrlses()).add(aValue);

			return (GeneratorT) this;
		}

		public AddedAttachmentDownloadUrlsAttachmentDownloadUrlsBuilder withAddedAttachmentDownloadUrls() {
			AttachmentDownloadUrls obj = new AttachmentDownloadUrls();

			withAddedAttachmentDownloadUrls(obj);

			return new AddedAttachmentDownloadUrlsAttachmentDownloadUrlsBuilder(
					obj);
		}

		@SuppressWarnings("unchecked")
		public GeneratorT withAddresseeLists(List<AddresseeList> aValue) {
			instance.setAddresseeLists(aValue);

			return (GeneratorT) this;
		}

		@SuppressWarnings("unchecked")
		public GeneratorT withAddedAddresseeList(AddresseeList aValue) {
			if (instance.getAddresseeLists() == null) {
				instance.setAddresseeLists(new ArrayList<AddresseeList>());
			}

			((ArrayList<AddresseeList>) instance.getAddresseeLists())
					.add(aValue);

			return (GeneratorT) this;
		}

		public AddedAddresseeListAddresseeListBuilder withAddedAddresseeList() {
			AddresseeList obj = new AddresseeList();

			withAddedAddresseeList(obj);

			return new AddedAddresseeListAddresseeListBuilder(obj);
		}

		public class AddedAttachmentDownloadUrlsAttachmentDownloadUrlsBuilder
				extends
				AttachmentDownloadUrlsBuilderBase<AddedAttachmentDownloadUrlsAttachmentDownloadUrlsBuilder> {
			public AddedAttachmentDownloadUrlsAttachmentDownloadUrlsBuilder(
					AttachmentDownloadUrls aInstance) {
				super(aInstance);
			}

			@SuppressWarnings("unchecked")
			public GeneratorT endAttachmentDownloadUrls() {
				return (GeneratorT) EmailBuilderBase.this;
			}
		}

		public class AddedAddresseeListAddresseeListBuilder
				extends
				AddresseeListBuilderBase<AddedAddresseeListAddresseeListBuilder> {
			public AddedAddresseeListAddresseeListBuilder(
					AddresseeList aInstance) {
				super(aInstance);
			}

			@SuppressWarnings("unchecked")
			public GeneratorT endAddresseeList() {
				return (GeneratorT) EmailBuilderBase.this;
			}
		}
	}

	public static class AttachmentDownloadUrlsBuilderBase<GeneratorT extends AttachmentDownloadUrlsBuilderBase<GeneratorT>> {
		private AttachmentDownloadUrls instance;

		protected AttachmentDownloadUrlsBuilderBase(
				AttachmentDownloadUrls aInstance) {
			instance = aInstance;
		}

		protected AttachmentDownloadUrls getInstance() {
			return instance;
		}

		@SuppressWarnings("unchecked")
		public GeneratorT withId(Long aValue) {
			instance.setId(aValue);

			return (GeneratorT) this;
		}

		@SuppressWarnings("unchecked")
		public GeneratorT withEmail(Email aValue) {
			instance.setEmail(aValue);

			return (GeneratorT) this;
		}

		public EmailEmailBuilder withEmail() {
			Email obj = new Email();

			withEmail(obj);

			return new EmailEmailBuilder(obj);
		}

		@SuppressWarnings("unchecked")
		public GeneratorT withUrl(String aValue) {
			instance.setUrl(aValue);

			return (GeneratorT) this;
		}

		public class EmailEmailBuilder extends
				EmailBuilderBase<EmailEmailBuilder> {
			public EmailEmailBuilder(Email aInstance) {
				super(aInstance);
			}

			@SuppressWarnings("unchecked")
			public GeneratorT endEmail() {
				return (GeneratorT) AttachmentDownloadUrlsBuilderBase.this;
			}
		}
	}
}
