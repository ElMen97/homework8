public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.name = "Эльвира";
        post.patronymic = "Борисовна";
        post.surname = "Меньшикова";
        post.birthday.day = 8;
        post.birthday.month = 5;
        post.birthday.year = 1997;
        post.passport = "1111 № 000000";
        post.phone = "+7 (987)-654-32-10";
        post.subscription = true;
    }
}
