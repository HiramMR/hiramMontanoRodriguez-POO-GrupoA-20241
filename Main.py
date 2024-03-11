from Library import Library
from User import User
from Book import Book
import sys

library = Library()
name=""
title=""

user = User(name)
book = Book(title)

while True:
        print("1.- Agregar usuario")
        print("2.- Agregar libro")
        print("3.- Rentar libro")
        print("4.- Mostrar todos los usuarios")
        print("5.- Mostrar todos los libros")
        print("6.- Mostrar todos los usuarios que hayan rentado libros")
        print("7.- Mostrar libros que no han sido rentados")
        print("8.- Mostrar libros que han sido rentados")
        print("9.- Salir")
        opcion = input("Ingrese la opcion deseada: ")
        
        if opcion == "1":
            name = input("Ingrese el nombre del usuario: ")
            user = User(name)
            library.agregar_usuario(user)
            print("\nUsuario agregado. \n")
            
        elif opcion == "2":
            title = input("Ingrese el titulo del libro: ")
            book = Book(title)
            library.agregar_libro(book)
            print("\nLibro agregado.\n")
            
        elif opcion == "3":
            name_rent = input("Ingrese el usuario que rentará el libro: \n")
            title_rent = input("Ingrese el libro que rentará: ")
            library.rentar_libro(name_rent, title_rent)
            
        elif opcion == "4":
            print("******USUARIOS DE LA LIBRERIA******\n")  
            if len(library.get_users()) == 0:
                print("No hay usuarios registrados.\n")
            else:
                library.mostrar_usuarios()
                
        elif opcion == "5":
            print("******LIBROS DE LA LIBRERIA******\n")
            if len(library.get_books()) == 0:
                print("No hay libros registrados.\n")
            else:
                library.mostrar_libros()
        
        elif opcion == "6":
            print("******USUARIOS QUE HAN RENTADO AL MENOS UN LIBRO******\n")
            usuarios_rentados = [user for user in library.get_users() if user.is_rented_a_book()]
            if len(usuarios_rentados) == 0:
                print("No hay usuarios que hayan rentado libros.\n")
            else:
                for user in usuarios_rentados:
                    print(user.get_name()+"\n")
                           
        elif opcion == "7":
            print("******LIBROS NO RENTADOS******\n")
            libros_no_rentados =[book for book in library.get_books() if not book.is_rented()]
            if len(libros_no_rentados) == 0:
                print("Todos los libros han sido rentados.\n")
            else:
                for book in libros_no_rentados:
                    print(book.get_title()+"\n")    
                
        elif opcion == "8":
            print("******LIBROS RENTADOS******\n")
            libros_rentados = [book for book in library.get_books() if book.is_rented()]
            if len(libros_rentados) == 0:
                print("No hay libros rentados.\n")
            else:
                for book in libros_rentados:
                    print(book.get_title()+"\n")    
                
        elif opcion == "9":
            print("Fin.")
            sys.exit()
                                           
                            
                      
            