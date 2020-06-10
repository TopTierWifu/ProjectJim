package me.josh444.projectjim.utils;

import java.util.UUID;

import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier.Operation;
import org.bukkit.inventory.EquipmentSlot;

public class Attributes {
	
	private UUID uuid;
	private Attribute attribute;
	private double amount;
	private Operation operation;
	private EquipmentSlot slot;
	
	public Attributes(UUID uuid, Attribute attribute, double amount, Operation operation, EquipmentSlot slot) {
		this.uuid = uuid;
		this.attribute = attribute;
		this.amount = amount;
		this.operation = operation;
		this.slot = slot;
	}
	
	public UUID getUUID() {
		return uuid;
	}
	
	public Attribute getAttribute() {
		return attribute;
	}

	public double getAmount() {
		return amount;
	}

	public Operation getOperation() {
		return operation;
	}

	public EquipmentSlot getSlot() {
		return slot;
	}
	
	public static Attributes[] getArmorData(UUID[] uuid, double toughness, double armor, EquipmentSlot slot) {
		Attributes[] result = new Attributes[] {
				new Attributes(uuid[0], Attribute.GENERIC_ARMOR_TOUGHNESS, toughness, Operation.ADD_NUMBER, slot),
				new Attributes(uuid[1], Attribute.GENERIC_ARMOR, armor, Operation.ADD_NUMBER, slot)
				};
		return result;
	}

}
