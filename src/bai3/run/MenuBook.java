package bai3.run;

import bai3.entity.Book;

import java.util.Scanner;

public class MenuBook {
    public static Book[] books = new Book[0];
    public static int indexBooks = 0;
    public static void menuBook(Scanner scanner) {
        do {
            System.out.println("**************** MENU ****************");
            System.out.println("1. Thêm mới sách");
            System.out.println("2. Cập nhật thông tin sách");
            System.out.println("3. Xoá sách");
            System.out.println("4. Tìm kiếm sách");
            System.out.println("5. Hiển thị danh sách sách theo nhóm thể loại");
            System.out.println("6. Thoát");
            System.out.println("**************************************");
            System.out.println("Lựa chọn đê: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addNewBooks(scanner);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    showListBook();
                    break;
                case 6:
                    MainMenu.menuMain(scanner);
                    break;
                default:
                    System.err.println("Vui lòng nhập lại từ 1 -> 3");
            }
        } while (true);
    }

    public static void showListBook() {
        if (books != null) {
            for (Book c : books) {
                c.displayData();
            }
        }
    }

    public static void addNewBooks(Scanner scanner) {
        System.out.println("Nhập vào số lượng muốn thêm");
        int n = Integer.parseInt(scanner.nextLine());

        Book[] newbooks = new Book[books.length + n];

        // [1,2,3,4,...]
        if (indexBooks == 0) {
            for (int i = books.length; i < n; i++) {
                newbooks[i] = new Book();
                newbooks[i].inputData(scanner);
                books = newbooks;
                indexBooks++;
            }
        } else {
            for (int i = 0; i < books.length; i++) {
                newbooks[i] = books[i];
            }
            for (int i = books.length - 1; i < n; i++) {
                newbooks[i] = new Book();
                newbooks[i].inputData(scanner);
                books = newbooks;
                indexBooks++;
            }
        }
    }

    public static void updateBooksById(Scanner scanner) {
        System.out.println("Enter book id: ");

    }

//    public static int findIndexBookById(int index) {
//
//    }
}
