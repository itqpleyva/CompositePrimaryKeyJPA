# JPAMysqlExample
Example of the JPA and Mysql Database integration

<p>In this example,we create a composite primary key in two differents ways</p>
<ul>
<li>using @IdClass</li>
<li>using @Embeddable</li>
</ul>

<h2>@IdClass</h2>

<p>Defining the AccountId class and the attributes to be used as composite primary key</p>

<img  src="accountid.png"/>

<p>Defining the Account class, adding <b>@IdClass(AccountId.class)</b> and the <b>@Id</b> attributes(must be the same as AccountId)</p>

<img  src="account.png"/>

<h2>@Embeddable</h2>
<p>Defining the BookId class and the attributes to be used as composite primary key, the BookId class is annotated with <b>@Embeddable</b></p>

<img  src="bookid.png"/>

<p>Defining the Book class and the bookId attribute to be used as composite primary key, the bookId attribute is annotated with <b>@EmbeddedId</b></p>

<img  src="book.png"/>

<p>Defining the Load class to create account and  book instances</p>

<img  src="load.png"/>
