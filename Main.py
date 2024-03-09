from BankAccount import BankAccount
from Employee import Employee
from Bank import Banco


class Main:
    @staticmethod
    def main():
        banco = Banco()

        while True:
            print("1. Agregar empleado")
            print("2. Mostrar todos los empleados y sus cuentas")
            print("3. Mostrar información de un empleado en específico")
            print("4. Salir")
            opcion = int(input("Ingrese la opción deseada: "))

            if opcion == 1:
                nombre_empleado = input("Ingrese el nombre del empleado: ")
                nuevo_empleado = Employee(nombre_empleado)

                cantidad_cuentas = int(input("Ingrese la cantidad de cuentas bancarias del empleado: "))
                for i in range(cantidad_cuentas):
                    tipo_cuenta = input("Ingrese el tipo de cuenta: ")
                    numero_cuenta = int(input("Ingrese el número de cuenta {}: ".format(i + 1)))
                    saldo_cuenta = float(input("Ingrese el saldo de la cuenta {}: ".format(i + 1)))

                    cuenta = BankAccount(numero_cuenta, saldo_cuenta, tipo_cuenta)
                    if tipo_cuenta.upper() == "A":
                        cuenta.depositA(tipo_cuenta, saldo_cuenta)
                    elif tipo_cuenta.upper() == "B":
                        cuenta.depositB(tipo_cuenta, saldo_cuenta)
                    elif tipo_cuenta.upper() == "C":
                        cuenta.depositC(tipo_cuenta, saldo_cuenta)
                    else:
                        print("Tipo de cuenta incorrecta.")
                        exit(0)

                    nuevo_empleado.agregar_cuenta(cuenta)

                banco.agregar_empleado(nuevo_empleado)

            elif opcion == 2:
                print("Empleados y sus cuentas:")
                for empleado in banco.get_empleados():
                    print("Nombre: ", empleado.get_nombre())
                    for cuenta in empleado.get_accounts():
                        print("Número de cuenta: ", cuenta.get_numero_cuenta())
                        print("Saldo: ", cuenta.get_saldo_cuenta())

            elif opcion == 3:
                nombre = input("Ingrese el nombre del empleado: ")
                encontrado = False
                for empleado in banco.get_empleados():
                    if empleado.get_nombre() == nombre:
                        print("Empleado encontrado:")
                        print("Nombre: ", empleado.get_nombre())
                        for cuenta in empleado.get_accounts():
                            print("Número de cuenta: ", cuenta.get_numero_cuenta())
                            print("Saldo: ", cuenta.get_saldo_cuenta())
                        encontrado = True
                        break
                if not encontrado:
                    print("Empleado no encontrado.")

            elif opcion == 4:
                print("Fin.")
                exit(0)

            else:
                print("Opción no válida.")

if __name__ == "__main__":
    Main.main()