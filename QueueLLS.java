public class QueueLLS {
    TugasNode front, rear;
    int size = 0;
    int max = 10;

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }

    public void enqueue(TugasMahasiswa data) {
        if (isFull()) {
            System.out.println("Antrian penuh");
            return;
        }

        TugasNode newNode = new TugasNode(data);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
        System.out.println(data.nama + " berhasil mendaftar antrian");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        System.out.println("Mahasiswa dipanggil:");
        front.data.tampil();

        front = front.next;
        size--;

        if (front == null) {
            rear = null;
        }
    }

    public void tampilDepan() {
        if (!isEmpty()) {
            System.out.println("Antrian terdepan:");
            front.data.tampil();
        }
    }

    public void tampilBelakang() {
        if (!isEmpty()) {
            System.out.println("Antrian terakhir:");
            rear.data.tampil();
        }
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa mengantre: " + size);
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        TugasNode temp = front;
        System.out.println("Daftar Antrian:");

        while (temp != null) {
            temp.data.tampil();
            temp = temp.next;
        }
    }
}