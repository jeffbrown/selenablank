package selenablank

class Thing {
    String name

    static constraints = {
        name nullable: false, blank: false, size: 1..20
    }
}
