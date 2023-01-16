abstract class Notif {

	abstract void SMS();

	abstract void email();

	abstract void push();

	void notifyUser() {
		System.out.println("Oka notification aNUKO");
	}
}

class Duo extends Notif {
	void SMS() {
		System.out.println("SMS kosam");
	}

	void email() {
		System.out.println("email kosam");
	}

	void push() {
		System.out.println("push kosam");
		// TODO Auto-generated method stub

	}
}

class Fb extends Notif {
	void SMS() {
		System.out.println("SMS fb kosam");
	}

	void email() {
		System.out.println("email fb kosam");
	}

	void push() {
		System.out.println("push fb kosam");
		// TODO Auto-generated method stub

	}
}

class Patriot extends Notif {
	void SMS() {
		System.out.println("SMS gmu kosam");
	}

	void email() {
		System.out.println("email gmu kosam");
	}

	void push() {
		System.out.println("push gmu kosam");
	}
}

class Notifz {
	Notif getNotif(String name) {
		if (name.equals("Duo"))
			return new Duo();
		if (name.equals("Fb"))
			return new Fb();
		else if (name.equals("Patriot"))
			return new Patriot();
		else
			return null;

	}
}

public class Notification {
	public static void main(String[] args) {
		Notifz nf = new Notifz();
		Notif x = nf.getNotif("Fb");
		x.SMS();
		x.email();
		x.push();

	}
}
