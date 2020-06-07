package me.josh444.projectjim.utils;

import java.util.UUID;

import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier.Operation;
import org.bukkit.inventory.EquipmentSlot;

public class ItemAttribute {

	private UUID uuid;
	private Attribute attribute;
	private double amount;
	private Operation operation;
	private EquipmentSlot slot;
	
	public ItemAttribute(UUID uuid, Attribute attribute, double amount, Operation operation, EquipmentSlot slot) {
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
	
	public static final ItemAttribute[] T2_DIAMOND_BOOTS = new ItemAttribute[] {new ItemAttribute(UUID.randomUUID(), Attribute.GENERIC_ARMOR_TOUGHNESS, 3, Operation.ADD_NUMBER, EquipmentSlot.FEET),new ItemAttribute(UUID.randomUUID(), Attribute.GENERIC_ARMOR, 4, Operation.ADD_NUMBER, EquipmentSlot.FEET)};
	public static final ItemAttribute[] T3_DIAMOND_BOOTS = new ItemAttribute[] {new ItemAttribute(UUID.randomUUID(), Attribute.GENERIC_ARMOR_TOUGHNESS, 4, Operation.ADD_NUMBER, EquipmentSlot.FEET),new ItemAttribute(UUID.randomUUID(), Attribute.GENERIC_ARMOR, 5, Operation.ADD_NUMBER, EquipmentSlot.FEET)};
	public static final ItemAttribute[] T4_DIAMOND_BOOTS = new ItemAttribute[] {new ItemAttribute(UUID.randomUUID(), Attribute.GENERIC_ARMOR_TOUGHNESS, 5, Operation.ADD_NUMBER, EquipmentSlot.FEET),new ItemAttribute(UUID.randomUUID(), Attribute.GENERIC_ARMOR, 6, Operation.ADD_NUMBER, EquipmentSlot.FEET)};

}
