import java.util.ArrayList;

public class BlockChainProgram {
    public static void main(String[] args) {

        // initialiasing arraylist of Blocks called blockChain
        ArrayList<Block> blockChain = new ArrayList<>();

        // first block, blockHash = 1998290691, previousBlockHash = 0
        String[] initialValues = { "Shubh has 100$ in account" };
        Block firstBlock = new Block(initialValues, 0);
        blockChain.add(firstBlock);
        printBlockChain(firstBlock, blockChain);

        // second block, blockHash = -646975631, previousBlockHash = 1998290691
        String[] shubhGivesMohan = { "Shubh gives Mohan 5$" };
        Block secondBlock = new Block(shubhGivesMohan, firstBlock.getBlockHash());
        blockChain.add(secondBlock);
        printBlockChain(secondBlock, blockChain);

        // third block, blockHash = 128858262 , previousBlockHash = -646975631
        String[] mohanGivesShubhBack = { "Mohan gives back 5$" };
        Block thirdBlock = new Block(mohanGivesShubhBack, secondBlock.getBlockHash());
        blockChain.add(thirdBlock);
        printBlockChain(thirdBlock, blockChain);

    }

    static void printBlockChain(Block block, ArrayList<Block> blockchain) {

        // printing the block
        System.out.println("Block : \n" + block.toString());
        // printing the array of blocks ( blockchain )
        System.out.println("Block Chain : \n" + blockchain.toString() + "\n");
    }

}
