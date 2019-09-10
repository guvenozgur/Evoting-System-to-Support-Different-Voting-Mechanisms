package io.github.com.authorityservice.KeyGenerationModels;

import java.math.BigInteger;

public class PaillierVotingModel extends VotingModel {

    private BigInteger p;
    private BigInteger q;
    private BigInteger n;
    private BigInteger carmichaelValue;
    private BigInteger g;
    private BigInteger nSquare;

    private int bitLength;

    public BigInteger getP() {
        return p;
    }

    public void setP(BigInteger p) {
        this.p = p;
    }

    public BigInteger getQ() {
        return q;
    }

    public void setQ(BigInteger q) {
        this.q = q;
    }

    public BigInteger getCarmichaelValue() {
        return carmichaelValue;
    }

    public void setCarmichaelValue(BigInteger carmichaelValue) {
        this.carmichaelValue = carmichaelValue;
    }


    public BigInteger getnSquare() {
        return nSquare;
    }

    public void setnSquare(BigInteger nSquare) {
        this.nSquare = nSquare;
    }

    public BigInteger getN() {
        return n;
    }

    public void setN(BigInteger n) {
        this.n = n;
    }

    public BigInteger getG() {
        return g;
    }

    public void setG(BigInteger g) {
        this.g = g;
    }

    public int getBitLength() {
        return bitLength;
    }

    public void setBitLength(int bitLength) {
        this.bitLength = bitLength;
    }
}
