from User import User
from Book import Book
class Library:
    __users = []
    __books = []
    __notRentedBooks = []
    __rentedBooks = []
    
    
    def __init__(self):
        self.__users = []
        self.__books = []
        self.__notRentedBooks = []
        self.__rentedBooks = []
        
    def get_users(self):
        return self.__users
    
    def get_books(self):
        return self.__books
    
    def get_not_rented_books(self):
        return self.__notRentedBooks
    
    def get_rented_books(self):
        return self.__rentedBooks
    
    def agregar_usuario(self, user):
        self.__users.append(user)
        
    def agregar_libro(self, book):
        self.__books.append(book)
        
    def mostrar_usuarios(self):
        for user in self.__users:
            print(user.get_name()+"\n")
            
    def mostrar_libros(self):
        for book in self.__books:
            print(book.get_title()+"\n")
            
    def mostrar_libros_no_rentados(self):
        for book in self.__books:
            if book.is_rented==False:
                print(book.get_title()+"\n")
            
    def mostrar_libros_rentados(self):
        for book in self.__books:
            if book.is_rented==True:
                print(book.get_title()+"\n")
                
    def mostrar_usuarios_que_han_rentado(self):
        for user in self.__users:
            if user.is_rented_a_book==True:
                print(user.get_name()+"\n")
                
    def rentar_libro(self, name, title):
        user = None
        book = None
        user_found = False
        book_found = False
        
        for u in self.__users:
            if u.get_name() == name:
                user = u
                user_found = True
                break
            
        for b in self.__books:
            if b.get_title() == title:
                book = b
                book_found = True
                break
         
        if user_found and book_found:
            if not book.is_rented():
                    book.set_rented(True)
                    user.set_rented_a_book(True)
                    print("\nLibro rentado por el usuario "+ name+"\n")
            else:
                print("\nEl libro ya está rentado\n")  
        
        else:
            print("\nEl usuario o el libro no existen en la libreria\n")              