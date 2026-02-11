package company;

enum JobLevel {
    JUNIOR(1), MID(2), SENIOR(3), LEAD(4);

    private int levelCode;

    JobLevel(int levelCode) {

        this.levelCode = levelCode;
    }

    public int getLevelCode() {
        return levelCode;
    }


    @Override
    public String toString() {

        return super.toString() + "("+ levelCode +")";
    }
}



