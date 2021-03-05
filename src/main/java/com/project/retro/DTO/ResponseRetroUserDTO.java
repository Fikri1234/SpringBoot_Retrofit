package com.project.retro.DTO;

import java.util.List;

public class ResponseRetroUserDTO {

	private List<Results> results;

	private Info info;

	public void setResults(List<Results> results) {
		this.results = results;
	}

	public List<Results> getResults() {
		return this.results;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

	public Info getInfo() {
		return this.info;
	}

	public class Results {
		private String gender;

		private Name name;

		private Location location;

		private String email;

		private Login login;

		private Dob dob;

		private Registered registered;

		private String phone;

		private String cell;

		private Id id;

		private Picture picture;

		private String nat;

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getGender() {
			return this.gender;
		}

		public void setName(Name name) {
			this.name = name;
		}

		public Name getName() {
			return this.name;
		}

		public void setLocation(Location location) {
			this.location = location;
		}

		public Location getLocation() {
			return this.location;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getEmail() {
			return this.email;
		}

		public void setLogin(Login login) {
			this.login = login;
		}

		public Login getLogin() {
			return this.login;
		}

		public void setDob(Dob dob) {
			this.dob = dob;
		}

		public Dob getDob() {
			return this.dob;
		}

		public void setRegistered(Registered registered) {
			this.registered = registered;
		}

		public Registered getRegistered() {
			return this.registered;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getPhone() {
			return this.phone;
		}

		public void setCell(String cell) {
			this.cell = cell;
		}

		public String getCell() {
			return this.cell;
		}

		public void setId(Id id) {
			this.id = id;
		}

		public Id getId() {
			return this.id;
		}

		public void setPicture(Picture picture) {
			this.picture = picture;
		}

		public Picture getPicture() {
			return this.picture;
		}

		public void setNat(String nat) {
			this.nat = nat;
		}

		public String getNat() {
			return this.nat;
		}
	}

	public class Info {
		private String seed;

		private int results;

		private int page;

		private String version;

		public void setSeed(String seed) {
			this.seed = seed;
		}

		public String getSeed() {
			return this.seed;
		}

		public void setResults(int results) {
			this.results = results;
		}

		public int getResults() {
			return this.results;
		}

		public void setPage(int page) {
			this.page = page;
		}

		public int getPage() {
			return this.page;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getVersion() {
			return this.version;
		}
	}

	public class Name {
		private String title;

		private String first;

		private String last;

		public void setTitle(String title) {
			this.title = title;
		}

		public String getTitle() {
			return this.title;
		}

		public void setFirst(String first) {
			this.first = first;
		}

		public String getFirst() {
			return this.first;
		}

		public void setLast(String last) {
			this.last = last;
		}

		public String getLast() {
			return this.last;
		}
	}

	public class Street {
		private int number;

		private String name;

		public void setNumber(int number) {
			this.number = number;
		}

		public int getNumber() {
			return this.number;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}
	}

	public class Coordinates {
		private String latitude;

		private String longitude;

		public void setLatitude(String latitude) {
			this.latitude = latitude;
		}

		public String getLatitude() {
			return this.latitude;
		}

		public void setLongitude(String longitude) {
			this.longitude = longitude;
		}

		public String getLongitude() {
			return this.longitude;
		}
	}

	public class Timezone {
		private String offset;

		private String description;

		public void setOffset(String offset) {
			this.offset = offset;
		}

		public String getOffset() {
			return this.offset;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getDescription() {
			return this.description;
		}
	}

	public class Location {
		private Street street;

		private String city;

		private String state;

		private String country;

		private int postcode;

		private Coordinates coordinates;

		private Timezone timezone;

		public void setStreet(Street street) {
			this.street = street;
		}

		public Street getStreet() {
			return this.street;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getCity() {
			return this.city;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getState() {
			return this.state;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getCountry() {
			return this.country;
		}

		public void setPostcode(int postcode) {
			this.postcode = postcode;
		}

		public int getPostcode() {
			return this.postcode;
		}

		public void setCoordinates(Coordinates coordinates) {
			this.coordinates = coordinates;
		}

		public Coordinates getCoordinates() {
			return this.coordinates;
		}

		public void setTimezone(Timezone timezone) {
			this.timezone = timezone;
		}

		public Timezone getTimezone() {
			return this.timezone;
		}
	}

	public class Login {
		private String uuid;

		private String username;

		private String password;

		private String salt;

		private String md5;

		private String sha1;

		private String sha256;

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getUsername() {
			return this.username;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getPassword() {
			return this.password;
		}

		public void setSalt(String salt) {
			this.salt = salt;
		}

		public String getSalt() {
			return this.salt;
		}

		public void setMd5(String md5) {
			this.md5 = md5;
		}

		public String getMd5() {
			return this.md5;
		}

		public void setSha1(String sha1) {
			this.sha1 = sha1;
		}

		public String getSha1() {
			return this.sha1;
		}

		public void setSha256(String sha256) {
			this.sha256 = sha256;
		}

		public String getSha256() {
			return this.sha256;
		}
	}

	public class Dob {
		private String date;

		private int age;

		public void setDate(String date) {
			this.date = date;
		}

		public String getDate() {
			return this.date;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public int getAge() {
			return this.age;
		}
	}

	public class Registered {
		private String date;

		private int age;

		public void setDate(String date) {
			this.date = date;
		}

		public String getDate() {
			return this.date;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public int getAge() {
			return this.age;
		}
	}

	public class Id {
		private String name;

		private String value;

		public void setName(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getValue() {
			return this.value;
		}
	}

	public class Picture {
		private String large;

		private String medium;

		private String thumbnail;

		public void setLarge(String large) {
			this.large = large;
		}

		public String getLarge() {
			return this.large;
		}

		public void setMedium(String medium) {
			this.medium = medium;
		}

		public String getMedium() {
			return this.medium;
		}

		public void setThumbnail(String thumbnail) {
			this.thumbnail = thumbnail;
		}

		public String getThumbnail() {
			return this.thumbnail;
		}
	}

}
