package ch.spacebase.mcprotocol.standard.packet;

import ch.spacebase.mcprotocol.net.io.NetInput;
import ch.spacebase.mcprotocol.net.io.NetOutput;
import java.io.IOException;

import ch.spacebase.mcprotocol.net.Client;
import ch.spacebase.mcprotocol.net.ServerConnection;
import ch.spacebase.mcprotocol.packet.Packet;

public class PacketTabComplete extends Packet {

	public String text;

	public PacketTabComplete() {
	}

	public PacketTabComplete(String text) {
		this.text = text;
	}

	@Override
	public void read(NetInput in) throws IOException {
		this.text = in.readString();
	}

	@Override
	public void write(NetOutput out) throws IOException {
		out.writeString(this.text);
	}

	@Override
	public void handleClient(Client conn) {
	}

	@Override
	public void handleServer(ServerConnection conn) {
	}

	@Override
	public int getId() {
		return 203;
	}

}
