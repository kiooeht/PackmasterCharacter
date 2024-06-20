package thePackmaster.cards.dimensiongateabstracts;

public abstract class AbstractDimensionalCardGrift extends AbstractDimensionalCard {

    public AbstractDimensionalCardGrift(final String cardID, final int cost, final CardRarity rarity, final CardType type, final CardTarget target) {
        super(cardID, cost, rarity, type, target, "dimension/grift");
    }

    public AbstractDimensionalCardGrift(final String cardID, final int cost, final CardRarity rarity, final CardType type, final CardTarget target, final CardColor color) {
        super(cardID, cost, rarity, type, target, "dimension/grift", color);
    }

}