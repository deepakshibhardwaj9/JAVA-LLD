#### Milestone A [Represent User structure]:
1. Create the Base `User` Class
2. Add Constructors to `User`
    2.1 have userId, name, contactInfo which all of them are `string`.
    2.2 can have two behaviours:
        2.2.1 displayDashboard() - displays books borrowed or some other data.
        2.2.2 canBorrowBooks() - returns true if `borrowedBooksCount` < MAX_BORROW_LIMIT

3. Create a `Member`
    3.1 should have a count `borrowedBooksCount` to keep track.
    3.2 A constant which can define the MAX number of books allowed.

4. Create a `Librarian`
    4.1 should have extra attribute `employeeNumber`
    4.2 displayDashboard() -- returns dashboard for Librarian & employee No.
    4.3 canBorrowBooks() should always return true

    4.4 SPECIFIC METHODS (Just print some data as of now):
        4.4.1 addNewBook(Book book)
        4.4.2 removeBook(Book book)



#### Milestone B [Behaviour Implementation]:
- Implement books lending functionality the books.
    - Create `Lendable` Interface and

- Book --- can have attributes and some methods.






#### Milestone C
- Implement LibraryManagementSystem
    - It should have collection of Books and Users
    - Should have Search functionality. (Algorithm to be implemented by learners)