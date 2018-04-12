package AUT.CEIT.CA;

public class DirectMapCache {
    int BlockSize;
    int CacheSize;
    int NumberOfBlocks;
    victimCache VC;
    int[] address;
    int[] Blockindex;
    int[] Blocktags;

    int[] Indexes;
    int[] Tags;
    public DirectMapCache(int cachesize, int blocksize) {
        CacheSize = cachesize;
        BlockSize = blocksize;
        NumberOfBlocks = cachesize / blocksize;
        Blockindex = new int [NumberOfBlocks];
        Blocktags = new int [NumberOfBlocks];
        for (int i = 0; i < NumberOfBlocks; i ++) {
            Blockindex [i] = -1;
            Blocktags [i] = -1;
        }
    }

    public void setData(int[] address) {
        int x = address.length;
        int[] BlockOfAddress = new int[x];
        this.address = address;
        Indexes = new int[x];
        Tags = new int[x];
        for (int i = 0; i < x; i ++) {
            BlockOfAddress [i] = address[i]/BlockSize;
            Indexes [i] = BlockOfAddress[i] % NumberOfBlocks;
            Tags [i] = BlockOfAddress[i] / NumberOfBlocks;
        }
    }

    public double getHitRatioWithoutVictimCache () {
        double hit = 0;
        Blockindex [Indexes[0]] = Tags[0];
        for (int i = 1; i < Indexes.length; i ++) {
            if (Blockindex[Indexes[i]] == Tags[i]) {
                hit ++;
            } else {
                Blockindex [Indexes[i]] = Tags[i];
            }
        }
        return hit * 100 / Indexes.length;
    }

    public double getHitRatioWithVictimCache () {
        VC = new victimCache();
        double hit = 0;
        Blockindex [Indexes[0]] = Tags[0];
        for (int i = 1; i < Indexes.length; i ++) {
            if (Blockindex[Indexes[i]] == Tags[i]) {
                hit ++;
            } else {
                if (VC.refrenceHandler(Indexes[i]) > -1)
                    hit ++;
                else {
                    if (Blockindex[Indexes[i]] != -1)
                    VC.adderToCache(Blockindex[Indexes[i]]);
                }
                Blockindex [Indexes[i]] = Tags[i];
            }
        }
        return hit * 100 / Indexes.length;
    }
}
